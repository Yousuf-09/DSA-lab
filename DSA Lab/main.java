public class main{
    public void log(int[] numbers) {
        for (int i = 0; i < numbers.length; i++){ //O n
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args){//O 1
        main demo = new main();
        int[] data = {5,10,15};
        demo.log(data);
    }
} 


class temp{
    public void log(int[] numbers, String[] names){
        for (int number : numbers){ //BigO n
            System.out.println(number);
        }

        for (int name : names){ //BigO m
            System.out.println(name);
        }
        //total BigO will be (n+m) 
    }

    public static void main(String[] args){
        temp demo = new temp();
        int[] numbers = {1,2};
        String[] names = {"Ana" , "Bob" , "Cy"};
    }
}

class temp2{
    public void log(int[] numbers){
        for(int first : numbers){// BigO n
            for(int second : numbers){ //BigOn
                System.out.println(first + ", " + second);
            }
        }
        //total BigO will be n^2
        // if the input is same in both loops the variable will be same "n" and if the variable is different we will consider 2 different variable like "n" , "m"
    }

    public static void main(String[] args){
        temp2 demo = new temp2();
        int[] data = {1,2,3};
        demo.log(data);
    }
} 

class temp3{
    public int sum(int[] numbers){
        int total = 0;
        for (int number : numbers){
            total += number;
        }
        return total
    }

    public static void main(String[] args){
        temp3 demo = new temp3();
        int[] data = {4,8,15,16};
        int total = demo.sum(data);
        System.out.println("Sum = " + total);
    }
}

class temp4{
    public int[] doubleAll(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[i] * 2;
        }
        return numbers
    }

    public static void main(String[] args){
        temp4 demo = new temp4;
        int[] data = {1,2,3};
        System.out.println(demo.doubleAll(data));
    }
}