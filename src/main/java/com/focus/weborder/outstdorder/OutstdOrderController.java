package com.focus.weborder.outstdorder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class OutstdOrderController {
	
	final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	@Autowired
	private OutstdOrderService fmvOmOoService;
	
	@RequestMapping("/outstdorderaggr")
	public List<OrderOutstdPojo> getAggrByCust(
			@RequestParam String custcode,
			@RequestParam String date1,
			@RequestParam String date2,
			@RequestParam String po1,
			@RequestParam String po2)
	{
		Date d1 = new Date();
		Date d2 = new Date();
		try {
			d1 = new SimpleDateFormat("yyyy-MM-dd").parse(date1);
			d2 = new SimpleDateFormat("yyyy-MM-dd").parse(date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Long lPo1 = new Long(0);
		Long lPo2 = new Long(999999999999L);
		if (!(po1=="")) lPo1 = Long.valueOf(po1);
		if (!(po2=="")) lPo2 = Long.valueOf(po2);
		System.out.println("PO: " + lPo1.toString() + " - " + lPo2.toString());
	
		return fmvOmOoService.getOutstdAggr(custcode, d1, d2, lPo1, lPo2);
	}

	@RequestMapping("/outstdorder")
	public List<OrderOutstdPojo> getDetail(
			@RequestParam String custcode,
			@RequestParam String itemCode,
			@RequestParam String date1,
			@RequestParam String date2,
			@RequestParam String po1,
			@RequestParam String po2)
{
		Date d1 = new Date();
		Date d2 = new Date();
		try {
			d1 = new SimpleDateFormat("yyyy-MM-dd").parse(date1);
			d2 = new SimpleDateFormat("yyyy-MM-dd").parse(date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Long lPo1 = new Long(0);
		Long lPo2 = new Long(999999999999L);
		if (!(po1=="")) lPo1 = Long.valueOf(po1);
		if (!(po2=="")) lPo2 = Long.valueOf(po2);

		return fmvOmOoService.getOutstdByItem(custcode, itemCode, d1, d2, lPo1, lPo2);
	}
}
