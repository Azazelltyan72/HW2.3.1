public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    public String getFlowerName() {
        return flowerName;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerName != null && !flowerName.isEmpty() && !flowerName.isBlank()) {
            this.flowerName = flowerName;
        } else {
            this.flowerName = "Неизвестный цветок";
        }
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerName='" + flowerName + '\'' +
                ", flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
