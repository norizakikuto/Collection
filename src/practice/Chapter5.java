package practice;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {

	public static <T> void main(String[] args) {
		
		LocalDate date1 = LocalDate.parse("2021/10/21",DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		LocalDate date2 = LocalDate.parse("2021/09/15",DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		LocalDate date3 = LocalDate.parse("2021/12/04",DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		LocalDate date4 = LocalDate.parse("2021/08/10",DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		LocalDate date5 = LocalDate.parse("2021/11/09",DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		
		List<Task> tasks = new ArrayList<>();
		tasks.add(new Task(date1,"牛乳を買う"));
		tasks.add(new Task(date2,"〇〇社を面談"));
		tasks.add(new Task(date3,"手帳を買う"));
		tasks.add(new Task(date4,"散髪に行く"));
		tasks.add(new Task(date5,"スクールの課題を解く"));
		
		Collections.sort(tasks);
		
		for(int num = 0; num < 5; num++) {
			System.out.print(tasks.get(num).getDate() + ":");
			System.out.println(tasks.get(num).getTask());
		}
		
		
	}

}
