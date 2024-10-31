package Leetcode;

/*Даны две строки версий, version1 и version2. Сравните их.
Строка версии состоит из ревизий, разделенных точками '.'.
Значение ревизии — это её целочисленное преобразование с игнорированием ведущих нулей.

Для сравнения строк версий сравнивайте их значения ревизий в порядке слева направо.
Если одна из строк версий имеет меньше ревизий, то отсутствующие значения ревизий
следует считать равными 0.

Верните следующее:

- Если version1 < version2, верните -1.
- Если version1 > version2, верните 1.
- В противном случае верните 0.
*/
public class CompareVersion {
    public static void main(String[] args) {
        String string1 = "1.10";
        String string2 = "1.2";
        System.out.println(getRevision(string1,string2));
    }

    private static int getRevision(String str1, String str2) {
        String[] split1 = str1.split("\\.");
        String[] split2 = str2.split("\\.");
        return Integer.compare(Integer.parseInt(split1[1]), Integer.parseInt(split2[1]));
    }

}
