package web.model;

public class Car {

    private final int carId;
    private final String carBrand;
    private final String carModel;

    public Car(int carId, String carBrand, String carModel) {
        this.carId = carId;
        this.carBrand = carBrand;
        this.carModel = carModel;
    }

    public int getCarId() {
        return carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("carId=").append(carId);
        sb.append(", carBrand='").append(carBrand).append('\'');
        sb.append(", carModel='").append(carModel).append('\'');
        sb.append('}');
        return sb.toString();
    }
}