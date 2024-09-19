package SchoolBag.Product;
import SchoolBag.Object.*;

public class Eraser extends ProductObject {
    private String type; 
    private int eId;

    public Eraser() {
        super();
        type = "Резиновый"; 
        generateName();
        eId = 3;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected void generateName() {
        name = "Ластик";
    }

    @Override
    public String toString() {
        return super.toString() + "_Тип:" + type;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("добавляю изменения");
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj instanceof Eraser) {
            Eraser temp = (Eraser) obj;
            return this.eId == temp.eId && this.type.equals(temp.type) &&
                   this.quantity == temp.quantity && this.weight == temp.weight;
        } else return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.eId;
        hash = 37 * hash + (this.type != null ? this.type.hashCode() : 0);
        return hash;

    }
}
