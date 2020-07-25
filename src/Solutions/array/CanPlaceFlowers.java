package Solutions.array;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        if (flowerbed.length == 1 && flowerbed[0] == 0) return n <= flowerbed.length;
        int i = 0;
        while (i < flowerbed.length) {
            if ((i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0)
                    || (i < flowerbed.length - 1 && i > 0 && flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0)
                    || (i > 0 && flowerbed[i - 1] == 0 && flowerbed[i] == 0 && i == flowerbed.length - 1)) {
                flowerbed[i] = 1;
                n--;
                i++;
            } else i++;
        }
        return n <= 0;
    }
}
