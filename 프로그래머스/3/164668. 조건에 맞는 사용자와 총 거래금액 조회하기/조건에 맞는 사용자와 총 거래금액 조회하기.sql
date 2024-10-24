Select USER_ID, NICKNAME, a._ts TOTAL_SALES from (
SELECT WRITER_ID _rid, sum(price) _ts from USED_GOODS_BOARD where STATUS = 'DONE' group by 1 having sum(price)>=700000) a
join USED_GOODS_USER b on  a._rid = b.USER_ID order by 3;