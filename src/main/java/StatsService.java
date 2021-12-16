public class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int avgSales(long[] sales) {
        StatsService service = new StatsService();
        int result = service.sumSales(sales);
        return (result / sales.length);
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
        StatsService service = new StatsService();
        int avg = service.avgSales(sales);
        int less = 0;

        for (long sale : sales) {
            if (sale < avg) {
                less += 1;
            }
        }
        return less;
    }

    public int moreSales(long[] sales) {
        StatsService service = new StatsService();
        int avg = service.avgSales(sales);
        int more = 0;

        for (long sale : sales) {
            if (sale > avg) {
                more += 1;
            }
        }
        return more;
    }
}
