public class Main {


    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Person person1=new Person("qwerty1_прив","qwerty12_","qwerty12_");
        Person person2=new Person("qwerty2_","qwerty22_1","qwerty22_1");
        Person person3=new Person("gdybvkfurhbncmvkgirhfdsgfvkfdklfdjbbtuhtgrgbhf747834","qwerty3_","qwerty3_");
       CheckingConditions.allChecks(person1);


    }

}