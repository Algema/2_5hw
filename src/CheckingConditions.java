public class CheckingConditions {
    public  static boolean allChecks (Person person) {
            try {
                check(person);
                System.out.println("Пароль и логин корректные");
                return true;
            } catch (WrongLoginException  | WrongPasswordException e) {
                System.out.println("Проверьте правильность ввода логина и/или пароля");
                return false;
            }
    }

    private static void check(Person person) throws WrongLoginException,WrongPasswordException{
        if (person.getLogin().length() > 20) {
            throw new WrongLoginException("непраивльная длина логина, он слишком длинный");
        }

        String acceptableValues = "1234567890_qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        int i = 0;
        for (i = 0; i < person.getLogin().length(); i++) {
            String c = person.getLogin().charAt(i)+"";
            boolean contains = acceptableValues.contains(c);
            if (contains == false) {
                throw new WrongLoginException("Введен некорректный символ");
            }
        }

        if (person.getPassword().length() > 19) {
            throw new WrongPasswordException("непраивльная длина пароля, он слишком длинный");
        }

        String acceptableValues2 = "1234567890_qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        int q = 0;
        for (q = 0; q < person.getPassword().length(); q++) {
            String c = person.getPassword().charAt(q)+"";
            boolean contains = acceptableValues2.contains(c);
            if (contains == false) {
                throw new WrongPasswordException("Введен некорректный символ");
            }
        }
        String password = person.getPassword();
        String confirmPassword= person.getConfirmPassword();
        boolean passwordEqualsConfirmPassword=password.equals(confirmPassword);
        if (passwordEqualsConfirmPassword == false){
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

}





