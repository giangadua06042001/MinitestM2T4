package describe;

import astract.Phone;

public class Type extends Phone {
    private  int id;
    private String name;
    private String compaty;

    public Type(int id, String name, String compaty) {
        this.id = id;
        this.name = name;
        this.compaty = compaty;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name, String s) {
        this.name = name;
    }

    public String compaty() {
        return compaty;
    }

    public void setCompaty(String compaty) {
        this.compaty = compaty;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", compaty='" + compaty + '\'' +
                '}';
    }

    @Override
    public void updatePhone(String name, Type newPhone) {

    }
}
