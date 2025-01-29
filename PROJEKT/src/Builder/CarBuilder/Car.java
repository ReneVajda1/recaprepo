package Builder.CarBuilder;

public class Car {
    private String name;
    private String model;
    private int year;
    private String color;
    private boolean sunroof;

    public Car(Builder builder) {
        this.name = builder.name;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.sunroof = builder.sunroof;
    }



    public static Builder builder(){
        return new Builder();
    }
    public static class Builder {
        private String name;
        private String model;
        private int year;
        private String color;
        private boolean sunroof;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder model(String model){
            this.model = model;
            return this;
        }
        public Builder year(Integer year){
            this.year = year;
            return this;
        }
        public Builder color(String color){
            this.color = color;
            return this;
        }
        public Builder sunroof(Boolean sunroof){
            this.sunroof = sunroof;
            return this;
        }

        public Car build(){
            return new Car(this);

        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", sunroof=" + sunroof +
                '}';
    }
}
