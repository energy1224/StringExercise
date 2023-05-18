import java.lang.reflect.Array;
import java.util.*;

public class Cars {
    public static void main(String[] args) {
        ArrayList<Sedan> cars = new ArrayList<>();
        cars.add(new Sedan("Рено", "Логан"));
        cars.add(new Sedan("Рено", "Меган"));
        cars.add(new Sedan("Лада", "Калина"));
        cars.add(new Sedan("Рено", "Логан"));
        cars.add(new Sedan("Лада", "Калина"));
        cars.add(new Sedan("Тойота", "Королла"));
        cars.add(new Sedan("Лада", "Калина"));

        for (int i =0; i<cars.size();i++)
        {
            for (int j = 0; j < cars.size() ; j++) {
                if(i != j)
                {
                    System.out.println("сравниваем машинки с номерами "+i+" и "+j);
                    Sedan a = cars.get(i), b = cars.get(j);
                    System.out.println(a + " == "+ b+" "+ (a == b));
                    System.out.println(a + " equals "+b+"  "+ a.equals(b));

                }
            }
        }

        Set<Sedan> sedanSet = new HashSet<>();
        for (Sedan sed: cars ) {
            sedanSet.add(sed);
        }

        System.out.println("----------------------");
        System.out.println("Список уникальных машин: "+sedanSet);

        Set<String> carModelSet= new TreeSet<>();
        for (Sedan sed: cars) {
            carModelSet.add(sed.model);
        }
        System.out.println(carModelSet);
    }
}

class Sedan{
    String brand;
    String model;

    public Sedan(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "{" + brand + " " + model +  '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sedan sedan = (Sedan) o;
        return brand.equals( sedan.brand) && model.equals(sedan.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}


