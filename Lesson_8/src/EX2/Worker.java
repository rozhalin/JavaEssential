package EX2;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Worker {
    private String name;
    private String post;
    private int year;

    public Worker(String name, String post, int year) throws Exception{
        setName(name);
        setPost(post);
        setYear(year);
    }

    private void setName(String name) throws Exception {
        if (checkName(name)) {
            this.name = name;
        }
        else {
            throw new Exception("Некорректное ФИО");
        }
    }

    private boolean checkName(String name) {
        boolean result = false;
        Pattern pattern = Pattern.compile("^[А-яЁёA-z]*\\s[А-яЁёA-z]\\.[А-яёA-z]\\.$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.results().count() > 0) {
            result = true;
        }
        return result;
    }

    private void setYear(int year) throws Exception {
        if (checkYear(year)) {
            this.year = year;
        }
        else {
            throw new Exception("Некорректный год трудоустройства");
        }
    }

    private boolean checkYear(int year) {
        boolean result = true;
        int now = Calendar.getInstance().get(Calendar.YEAR);
        int minPossible = now - 100;
        if (year > now || year < minPossible) {
           result = false;
        }
        return result;
    }

    private void setPost(String post) {
        this.post = post;
    }

    private int getServiceLength() {
        int now = Calendar.getInstance().get(Calendar.YEAR);
        return now - this.year;
    }

    @Override
    public String toString() {
        return String.format("Работник %s, должность - %s, стаж работы %d.",this.name, this.post, getServiceLength());
    }
}
