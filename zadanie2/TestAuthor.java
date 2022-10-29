package zadanie2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Tyoma", "myemail@mail.ru", 'm');
        System.out.println("Имя автора: " + a.getName());
        System.out.println("Почта автора: " + a.getEmail());
        if (a.getGender() == 'm')
        {
            System.out.println("Пол автора: Мужской");
        } else if (a.getGender() == 'f') {
            System.out.println("Пол автора: Женский");
        }
        else System.out.println("Пол автора: неизвестен");

    }
}
