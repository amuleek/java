class Company {

    String domainName;

    public Company(){
        this.domainName = "default";
    }

    public Company(String domainName){
        this.domainName = domainName;
    }

    public void getName(){
        System.out.println(this.domainName);
    }

    public static void main(String[] args) {
        Company defaultObj = new Company();
        Company programizObj = new Company("programiz.com");

        defaultObj.getName();
        programizObj.getName();
    }
}
