package poly.b;

import java.sql.SQLOutput;

public class Human {

    private String residentId;

    public Human(String residentId) {
        this.residentId = residentId;
    }

    public void speak() {
        System.out.println("사람이 말합니다.");
    }

    public String getResidentId() {
        return residentId;
    }
}

