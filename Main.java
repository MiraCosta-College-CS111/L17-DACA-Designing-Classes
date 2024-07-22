class Main {
  public static void main(String[] args) {
    //System.out.println(jdnToDate(2421832));

    DACArecipient person1 = new DACArecipient();
    person1.setAll("Hernandez", "Alex", "25-6-567", "Mexico", 2421832, 2458882, 2459575, 'F');

    DACArecipient person2 = new DACArecipient();
    person2.setAll("Hernandez", "Alex", "25-6-567", "Mexico", 2421832, 2458882, 2459575, 'F');

		System.out.println(DACArecipient.jdnToDate(2434852));
		System.out.println(DACArecipient.jdnToDate(2450389));
		System.out.println(DACArecipient.jdnToDate(2459953));
    System.out.println(person1.equals(person2));
    System.out.println(person1);
    System.out.print(person1.printCard());
  }
}