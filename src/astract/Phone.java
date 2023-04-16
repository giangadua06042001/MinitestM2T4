package astract;

import describe.Contract;
import describe.Type;

public abstract class  Phone {
    public void display(Type type){};
    public void insertPhone(Contract contract){};
    public void removePhone(String name){};
    public void updatePhone(String name,String newPhone){};

    public abstract void updatePhone(String name, Type newPhone);
}
