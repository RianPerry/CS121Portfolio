public class Rose implements DescribeFlower {
    private String name, color, meaning;
    Rose(String name, String color, String meaning){
        this.name = name;
        this.color = color;
        this.meaning = meaning;
    }
    public String details() {
        return String.format("The flower is a %s\nIts color is %s\nIt represents %s",name,color,meaning);
    }
}
