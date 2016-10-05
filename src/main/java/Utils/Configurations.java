package Utils;

import java.util.Properties;

/**
 * Created by Çağatay Han on 2.09.2016.
 */
public class Configurations {

    private static Configurations instance;
    private static Object lock = new Object();

    Properties props = PropertyReader.getInstance().getProperties("selenium.properties");


    //HomePageItems
    private String origin;
    private String originResultList;
    private String destination;
    private String destinationResultList;
    private String departureDate;
    private String findTicketButton;

    //ResultPageItems
    private String firstFlightFromResults;
    private String resultList;

    //ReservationPageItems
    private String email;
    private String name;
    private String surname;
    private String publicId;
    private String birthdateDay;
    private String birthdateMonth;
    private String birthdateYear;
    private String birthdateDayToSet;
    private String birthdateMonthToSet;
    private String birthdateYearToSet;
    private String gender;
    private String cellPhone;
    private String purchaseButton;

    private String pnr;


    public Configurations() {
    }


    private void loadData() {
        //HomePageLoads
        origin = props.getProperty("origin");
        originResultList = props.getProperty("originResultList");
        destination = props.getProperty("destination");
        destinationResultList = props.getProperty("destinationResultList");
        departureDate = props.getProperty("departureDate");
        findTicketButton = props.getProperty("findTicketButton");

        //ResultPageLoads
        resultList = props.getProperty("resultList");
        firstFlightFromResults = props.getProperty("firstFlightFromResults");

        //ReservationPageLoads
        email = props.getProperty("email");
        name = props.getProperty("name");
        surname = props.getProperty("surname");
        publicId = props.getProperty("publicId");
        birthdateDay = props.getProperty("birthdateDay");
        birthdateMonth = props.getProperty("birthdateMonth");
        birthdateYear = props.getProperty("birthdateYear");
        birthdateDayToSet = props.getProperty("birthdateDayToSet");
        birthdateMonthToSet = props.getProperty("birthdateMonthToSet");
        birthdateYearToSet = props.getProperty("birthdateYearToSet");
        gender = props.getProperty("gender");
        cellPhone = props.getProperty("cellPhone");
        purchaseButton = props.getProperty("purchaseButton");

        pnr = props.getProperty("pnr");
    }

    public static Configurations getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new Configurations();
                    instance.loadData();
                }
            }
        }
        return instance;
    }

    public String getOrigin() {
        return origin;
    }

    public String getOriginResultList() {
        return originResultList;
    }

    public String getDestination() {
        return destination;
    }

    public String getDestinationResultList() {
        return destinationResultList;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getFindTicketButton() {
        return findTicketButton;
    }

    public String getFirstFlightFromResults() {
        return firstFlightFromResults;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPublicId() {
        return publicId;
    }

    public String getBirthdateDay() {
        return birthdateDay;
    }

    public String getBirthdateMonth() {
        return birthdateMonth;
    }

    public String getBirthdateYear() {
        return birthdateYear;
    }

    public String getBirthdateDayToSet() {
        return birthdateDayToSet;
    }

    public String getBirthdateMonthToSet() {
        return birthdateMonthToSet;
    }

    public String getBirthdateYearToSet() {
        return birthdateYearToSet;
    }

    public String getGender() {
        return gender;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getPurchaseButton() {
        return purchaseButton;
    }

    public String getResultList() {
        return resultList;
    }

    public String getPnr() {
        return pnr;
    }
}
