package web.model;



// не @Component, бинов создават не надо
public class Car {

    private int carId;
    private String carBrand;
    private String carModel;

    public Car(int carId, String carBrand, String carModel) {
        this.carId = carId;
        this.carBrand = carBrand;
        this.carModel = carModel;
    }


    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
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