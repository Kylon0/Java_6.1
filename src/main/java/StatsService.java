public class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int avgSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return (sum / sales.length);
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lessSales(long[] sales) {
        int sum = 0;
        int less = 0;

        for (long sale : sales) {
            sum += sale;
        }

        int avg = (sum / sales.length);

        for (long sale : sales) {
            if (sale < avg) {
                less += 1;
            }
        }
        return less;
    }

    public int moreSales(long[] sales) {
        int sum = 0;
        int more = 0;

        for (long sale : sales) {
            sum += sale;
        }

        int avg = (sum / sales.length);

        for (long sale : sales) {
            if (sale > avg) {
                more += 1;
            }
        }
        return more;
    }
}
