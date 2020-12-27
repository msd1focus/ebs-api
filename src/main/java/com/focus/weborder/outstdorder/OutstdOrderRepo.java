package com.focus.weborder.outstdorder;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OutstdOrderRepo extends JpaRepository<OutstdOrder, Long> {

	@Query(value = "select item_code as itemCode, item_name as itemName, "
			+ "sum(order_qty) as orderQtyOuts, "
			+ "sum(order_val) as orderValueOuts, "
			+ "sum(quote_qty) as quoteQtyOuts, "
			+ "sum(quote_val) as quoteValueOuts, "
			+ "order_qty_uom as uom "
			+ "from ( "
			+ "select cust_code, item_code, item_name, order_qty_uom, "
			+ "case flag_outs when 'Outs.Order' then outs_qty else 0 end order_qty, "
			+ "case flag_outs when 'Outs.Order' then outs_value_excppn else 0 end order_val, "
			+ "case flag_outs when 'Outs.Quote' then outs_qty else 0 end quote_qty, "
			+ "case flag_outs when 'Outs.Quote' then outs_value_excppn else 0 end quote_val "
			+ "from fmv_om_oo "
			+ "where cust_code = :pCustCode "
			+ "and order_date between :pDate1 and :pDate2 "
			+ "and order# between :po1 and :po2 "
			+ "union all "
			+ "select cust_code, item_code, item_name, order_qty_uom, "
			+ "case flag_outs when 'Outs.Order' then outs_qty else 0 end order_qty, "
			+ "case flag_outs when 'Outs.Order' then outs_value_excppn else 0 end order_val, "
			+ "case flag_outs when 'Outs.Quote' then outs_qty else 0 end quote_qty, "
			+ "case flag_outs when 'Outs.Quote' then outs_value_excppn else 0 end quote_val "
			+ "from fmv_om_oo "
			+ "where cust_code = :pCustCode "
			+ "and order# between :po1 and :po2 "
			+ "and quote_date between :pDate1 and :pDate2 and order_date is null "
			+ ") "
			+ "group by item_code, item_name, order_qty_uom ",
			nativeQuery = true)
	public List<OrderAggrI> getAggrByCustAndDateAndPo (@Param("pCustCode")String custCode,
										@Param("pDate1")Date pDate1,
										@Param("pDate2")Date pDate2,
										@Param("po1")Long po1,
										@Param("po2")Long po2
										) ;
	
	@Query(value = "select custpo# as custPo, "
			+ "item_code, item_name, "
			+ "case flag_outs when 'Outs.Order' then outs_qty else 0 end order_qty, "
			+ "order_source as orderSource, "
			+ "case flag_outs when 'Outs.Order' then outs_value_excppn else 0 end order_val, "
			+ "case flag_outs when 'Outs.Quote' then outs_qty else 0 end quote_qty, "
			+ "case flag_outs when 'Outs.Quote' then outs_value_excppn else 0 end quote_val, "
			+ "order_qty_uom "
			+ "from fmv_om_oo "
			+ "where cust_code = :pCustCode "
			+ "and item_code = :pItemCode "
			+ "and order_date between :pDate1 and :pDate2 "
			+ "and order# between :po1 and :po2 "
			+ "union all "
			+ "select custpo# as custPo, "
			+ "item_code, item_name, "
			+ "case flag_outs when 'Outs.Order' then outs_qty else 0 end order_qty, "
			+ "order_source as orderSource, "
			+ "case flag_outs when 'Outs.Order' then outs_value_excppn else 0 end order_val, "
			+ "case flag_outs when 'Outs.Quote' then outs_qty else 0 end quote_qty, "
			+ "case flag_outs when 'Outs.Quote' then outs_value_excppn else 0 end quote_val, "
			+ "order_qty_uom "
			+ "from fmv_om_oo "
			+ "where cust_code = :pCustCode "
			+ "and item_code = :pItemCode "
			+ "and order# between :po1 and :po2 "
			+ "and quote_date between :pDate1 and :pDate2 and order_date is null ",
			nativeQuery = true)
	public List<OrderDtlI> getDetail(@Param("pCustCode")String custCode, 
												@Param("pItemCode")String pItemCode,
												@Param("pDate1")Date pDate1,
												@Param("pDate2")Date pDate2,
												@Param("po1")Long po1,
												@Param("po2")Long po2
	) ;
}
