package describe;

import astract.Phone;

public class Contract extends Phone {
    private String name;
    private String number;


    public Contract() {
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String number() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Contract(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void updatePhone(String name, Type newPhone) {

    }
}
