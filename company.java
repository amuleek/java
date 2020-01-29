class Company {
    String domainName;
    // object is created in another class
    public Company(){
        domainName = "programiz.com";
    }
}

public class CompanyImplementation {
    
    public static void main(String[] args) {
        Company companyObj = new Company();
        System.out.println("Domain name = "+ companyObj.domainName);
    }
}
