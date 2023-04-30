


public class Main {
    public static void main(String[] args){
        Gryffindor[] gryffindors = {
                new Gryffindor ("Гарри Поттер", 90,16,15,80,10),
                new Gryffindor("Гермиона Грейнджер", 23,67,10,56,32),
                new Gryffindor("Рон Уизли", 59,3,90,13,82),
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 45,67,18,43,8),
                new Hufflepuff("Седрик Диггори", 99,1,39,71,54),
                new Hufflepuff("Джастин Финч-Флетчли", 42,26,76,39,80),
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг",41,15,10,90,8,17),
                new Ravenclaw("Падма Патил", 67,8,37,63,14,5),
                new Ravenclaw("Маркус Белби", 13,87,1,47,83,74),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 37,20,19,5,62,17,43),
                new Slytherin("Грэхэм Монтегю",80,7,31,26,8,25,98),
                new Slytherin("Грегори Гойл",56,34,19,56,1,45,72),
        };

        PrintService printService = new PrintService();
        printService.print(gryffindors);
        printService.print(hufflepuffs);
        printService.print(ravenclaws);
        printService.print(slytherins);
    }
}
