package bean;

public class Service {
    private int id;
    private String name;
    private int area;
    private double cost;
    private int maxPeople;
    private RentType rentTypeId;
    private ServiceType serviceTypeId;
    private String standRoom;
    private String descriptionOtherConveniance;
    private double poolArea;
    private int numberOfFloors;

    public Service() {
    }

    public Service(int id, String name, int area, double cost, int maxPeople, RentType rentTypeId,
                   ServiceType serviceTypeId, String standRoom, String descriptionOtherConveniance,
                   double poolArea, int numberOfFloors) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentTypeId = rentTypeId;
        this.serviceTypeId = serviceTypeId;
        this.standRoom = standRoom;
        this.descriptionOtherConveniance = descriptionOtherConveniance;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentType getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(RentType rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public ServiceType getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(ServiceType serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getStandRoom() {
        return standRoom;
    }

    public void setStandRoom(String standRoom) {
        this.standRoom = standRoom;
    }

    public String getDescriptionOtherConveniance() {
        return descriptionOtherConveniance;
    }

    public void setDescriptionOtherConveniance(String descriptionOtherConveniance) {
        this.descriptionOtherConveniance = descriptionOtherConveniance;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", maxPeople=" + maxPeople +
                ", rentTypeId=" + rentTypeId +
                ", serviceTypeId=" + serviceTypeId +
                ", standRoom='" + standRoom + '\'' +
                ", descriptionOtherConveniance='" + descriptionOtherConveniance + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
