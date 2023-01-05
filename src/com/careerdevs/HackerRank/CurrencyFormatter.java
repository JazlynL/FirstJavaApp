public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        NumberFormat usNum =NumberFormat.getCurrencyInstance(Locale.US);

        NumberFormat indiaNum =NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaNum =NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franNum =NumberFormat.getCurrencyInstance(Locale.FRANCE);


        String us = usNum.format(payment);
        String india = indiaNum.format(payment);
        String china = chinaNum.format(payment);
        String france = franNum.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        }