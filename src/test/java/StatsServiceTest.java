class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void sumSales() {
        StatsService service = new StatsService();

        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        long result = service.sumSales(sales);

        System.out.println(result);
    }

    @org.junit.jupiter.api.Test
    void avgSales() {
        StatsService service = new StatsService();

        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        long result = service.avgSales(sales);

        System.out.println(result);
    }

    @org.junit.jupiter.api.Test
    void maxSales() {
        StatsService service = new StatsService();

        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        long result = service.maxSales(sales);

        System.out.println(result);
    }

    @org.junit.jupiter.api.Test
    void minSales() {
        StatsService service = new StatsService();

        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        long result = service.minSales(sales);

        System.out.println(result);
    }

    @org.junit.jupiter.api.Test
    void lessSales() {
        StatsService service = new StatsService();

        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        long result = service.lessSales(sales);

        System.out.println(result);
    }

    @org.junit.jupiter.api.Test
    void moreSales() {
        StatsService service = new StatsService();

        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        long result = service.moreSales(sales);

        System.out.println(result);
    }
}