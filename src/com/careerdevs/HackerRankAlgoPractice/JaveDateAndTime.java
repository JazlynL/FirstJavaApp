public static String findDay(int month, int day, int year) {


        String [] newStr = new DateFormatSymbols().getWeekdays();

        Calendar cal = Calendar.getInstance();
        cal.set(year, month -1, day);

        String convert = newStr[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase();


        return convert;
        }