package MentorWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Надо создать объект, состоящий из двух полей имя и фамилия.
// Создать List этих объектов и с помощью стрима сдлеать мапу,
// где ключом будет имя, значением фамилия, но мапа должна быть регистронезависимая
//То есть map.get("Вася") и map.get("ВаСя") выдает одну и ту же фамилию
public class StreamMap {
    public static void main(String[] args) {
        List<FIO> list = Arrays.asList(new FIO("Tom", "Soyer"), new FIO("Jack", "Black"));
        Map<String, String> caseInMap = list.stream().collect(
                Collectors.toMap(name -> name.getName().toLowerCase(), FIO::getSurname,
                        (f1, f2) -> f1, () -> new CaseInMap<>()));
//        caseInMap = list.stream().collect(
//                Collectors.toMap(FIO::getName, FIO::getSurname, (f1, f2) -> f1, ()->new TreeMap<>(String.CASE_INSENSITIVE_ORDER)));
        System.out.println(caseInMap);
        System.out.println(caseInMap.get("JacK"));
    }
}

class CaseInMap<K, V> extends HashMap<String, V> {
    @Override
    public V put(String key, V value) {
        return super.put(key.toLowerCase(), value);
    }

    @Override
    public V get(Object key) {
        return super.get(((String) key).toLowerCase());
    }
}

class FIO {
    private String name;
    private String surname;

    public FIO(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
