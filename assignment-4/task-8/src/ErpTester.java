public class ErpTester {
    public static void main(String[] args) {
        Student rakib = new Student("Rakib", 12301455,"CSE");
        Student roy = new Student("Roy", 12501345, "CS");
        System.out.println("1*************");
        Erp ErpObj = new Erp();
        System.out.println("2*************");
        ErpObj.login(rakib);
        System.out.println("3*************");
        ErpObj.advising(rakib);
        System.out.println("4*************");
        rakib.email = "rakib@hotmail.com";
        rakib.password = "1234";
        System.out.println("5*************");
        ErpObj.login(rakib);
        System.out.println("6*************");
        ErpObj.advising(rakib);
        System.out.println("7*************");
        ErpObj.advising(rakib, "CSE110", "PHY111", "MAT110","CSE260");
        System.out.println("8*************");
        ErpObj.advising(rakib, "CSE110", "PHY111","MAT110");
        System.out.println("9*************");
        ErpObj.allAdviseeInfo();
        System.out.println("10*************");
        roy.email = "roy@hotmail.com";
        roy.password = "abcd";
        ErpObj.login(roy);
        System.out.println("11*************");
        ErpObj.advising(roy, "CSE110", "ENG101", "PHY112");
        System.out.println("12*************");
        ErpObj.allAdviseeInfo();

    }
}