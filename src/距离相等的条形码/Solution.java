package 距离相等的条形码;

public class Solution {

        public int[] rearrangeBarcodes2(int[] barcodes) {
            // 统计元素次数
            int[] cnt = new int[10001];
            // 次数最多的元素
            int maxCntItem = 0;
            // 统计元素出现次数过程中，顺便得到次数最多的元素 maxCntItem
            for (int x : barcodes) {
                if (++cnt[x] > cnt[maxCntItem]) {
                    maxCntItem = x;
                }
            }
            // 直接修改barcodes，idx指示当前给哪个位置赋值
            // 先插入偶数位置，从0开始
            int idx = 0;
            // 先用次数最多的元素 maxCntItem 去填充 barcodes 的所有偶数位置
            for ( ; cnt[maxCntItem] > 0; idx += 2) {
                barcodes[idx] = maxCntItem;
                cnt[maxCntItem]--;
            }
            // 遍历其他元素
            for (int i = 0; i < cnt.length; i++) {
                // 跳过无效位置（跳过 不存在的元素，和已经使用过的maxCntItem）
                if (cnt[i] == 0 || i == maxCntItem) {
                    continue;
                }
                // 用这个元素插空
                while (cnt[i] > 0) {
                    // 因为maxCntItem可能没有填完所有偶数位置，所以先接着往后填
                    // 回过头来再填奇数位置，从1开始
                    if (idx >= barcodes.length) {
                        idx = 1;
                    }
                    // 填空
                    barcodes[idx] = i;
                    // 元素次数减少
                    cnt[i]--;
                    // 下一个位置
                    idx += 2;
                }
            }
            // 返回
            return barcodes;
        }


    public static void main(String[] args) {

    }
}
