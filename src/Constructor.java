class Constructor {
    String Name;
    Constructor(String value){
        Name = value;
        System.out.println(Name);
    }

    public static void main(String[] args) {
        Constructor lang1 = new Constructor("Java");
        Constructor lang2 = new Constructor("Python");
        Constructor lang3 = new Constructor("C");
        Constructor lang4 = new Constructor("Kotlin");
    }
}
