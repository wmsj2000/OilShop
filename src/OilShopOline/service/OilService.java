package OilShopOline.service;

import java.util.List;

import OilShopOline.dao.OilDao;
import OilShopOline.domain.Oil;
import OilShopOline.domain.Orders;

public class OilService  {
	private OilDao dao = new OilDao();
	public void AddOil(String oil_brand, String oil_category, String oil_craft, String oil_rank, String oil_capacity,
			String oil_price, String oil_number, String oil_state) throws Exception {
		try {
			dao.AddOil(oil_brand, oil_category, oil_craft, oil_rank, oil_capacity,
					oil_price, oil_number, oil_state);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("AddOilʧ��");
		}
	}
	public int CheckOil(String oil_brand, String oil_category, String oil_craft, String oil_rank, String oil_capacity,
			String oil_price, String oil_state) throws Exception {
		try {
			int t = dao.CheckOil(oil_brand, oil_category, oil_craft, oil_rank, oil_capacity,
					oil_price,oil_state);
			return t;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("CheckOilʧ��");
		}
	}
	public void AddOilNumber(String oil_brand, String oil_category, String oil_craft, String oil_rank,
			String oil_capacity, String oil_price, String oil_number, String oil_state) throws Exception {
		try {
			dao.AddOilNumber(oil_brand, oil_category, oil_craft, oil_rank, oil_capacity,
					oil_price,oil_number, oil_state);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("AddOilNumberʧ��");
		}
	}
	public List<Oil> findAllOil() throws Exception {
		try {
			List<Oil> oils = dao.findAllOil();
			return oils;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("AddOilNumberʧ��");
		}
	}
	public List<Oil> findOilByManyCondition(String oil_id, String oil_brand, String oil_category, String oil_craft,
			String oil_rank, String oil_capacity, String oil_price1, String oil_price2, String oil_number1,
			String oil_number2, String oil_state) throws Exception {
		try {
			List<Oil> oils = dao.findOilByManyCondition(oil_id, oil_brand, oil_category,  oil_craft,
					 oil_rank,  oil_capacity,  oil_price1,  oil_price2,  oil_number1,
					 oil_number2,  oil_state);
			return oils;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("findOilByManyConditionʧ��");
		}
	}
	public void RemoveOil(String oil_id) throws Exception {
		try {
			dao.RemoveOil(oil_id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("RemoveOilʧ��");
		}
	}
	public void updateOil(String oil_id, String oil_brand, String oil_category, String oil_craft, String oil_rank,
			String oil_capacity, String oil_price, String oil_number, String oil_state) throws Exception {
		try {
			dao.updateOil(oil_id, oil_brand,oil_category, oil_craft, oil_rank,
					 oil_capacity,oil_price,oil_number, oil_state);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("updateOilʧ��");
		}
	}
	public List<Oil> CustomerfindAllOil() throws Exception {
		try {
			List<Oil> oils = dao.CustomerfindAllOil();
			return oils;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("CustomerfindAllOilʧ��");
		}
	}
	public List<Oil> findCartById(String customer_name) throws Exception {
		try {
			List<Oil> oils = dao.findCartById(customer_name);
			return oils;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("findCartByIdʧ��");
		}
	}
	public void RemoveOilFormCart(String customer_name, String oil_id) throws Exception {
		try {
			dao.RemoveOilFormCart(customer_name,oil_id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("RemoveOilFormCartʧ��");
		}
	}
	public List<Oil> findOrdersByName(String customer_name) throws Exception {
		try {
			List<Oil> oils = dao.findOrdersByName(customer_name);
			return oils;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("findOrdersByNameʧ��");
		}
	}
	public List<Orders> findNumbersByName(String customer_name) throws Exception {
		try {
			List<Orders> numbers = dao.findNumbersByName(customer_name);
			return numbers;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("findOrdersByNameʧ��");
		}
	}
	public List<Oil> findOils() throws Exception {
		try {
			List<Oil> oils = dao.findOils();
			return oils;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("findOilsʧ��");
		}
	}
	/*public List<Integer> findNumbers() throws Exception {
		try {
			List<Integer> numbers = dao.findNumbers();
			return numbers;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("findNumbersʧ��");
		}
	}*/
	public int getTotalMoney() throws Exception{
		try {
			int money = dao.getTotalMoney();
			return money;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("getTotalMoneyʧ��");
		}
	}
	

}
