import obstacles.*;
import participants.*;

public class JavaTwo {

    public static void main(String[] args) {

        Competitor[] competitors = {new Robot("T-1000", "Destroyer", 500, 50),
                                    new Cat("Мурзик", Color.BLACK),
                                    new Dog("Бобик", Color.WHITE),
                                    new Duck("Гага", Color.GREY)
        };
        Obstacle[] obstacles = {new Cross(400), new Wall(5), new Water(10)};

        Team team = new Team("Новые стражи галактики", competitors);

        System.out.println(team.getTeamName());
        System.out.println();

        System.out.println("Участники команды:");
        team.showResults();
        System.out.println();

        Course course = new Course(obstacles);

        System.out.println("Старт соревнований:");
        course.doIt(team);
        System.out.println();

        System.out.println("Результаты соревнования:");
        team.showResults();
        System.out.println();

        System.out.println("Участники команды, успешно завершившие соревнование:");
        team.showMembersFinishedCourse();

    }
}