import com.alibaba.fastjson.JSONObject;
import com.manage.entity.Contract;
import com.manage.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.manage.util.JsonResult;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "/contract")
public class ContractController {
    @Autowired
    private ContractService contractService;

    /**
     * showdoc
     * @catalog 合同模块
     * @title
     * @description 合同的接口
     * @method post
     * @url localhost:8080/contract/add
     * @param contractId 必选 int 商品id
     * @param goodsId 必选 int 商品id
     * @param contractShop 必选 String 供应商号
     * @param contractNumber 必选 int 合同数量
     * @param singlePrice 必选 int 供应单价
     * @param realNumber 必选 int 实际入库数量
     * @return {"status":1,data:{},msg:"新建合同成功"}
     * @return_param status int 返回状态
     * @return_param data json 返回数据
     * @return_param msg string 返回信息，0为成功
     * @remark head 默认为 string img/default.jpeg，检查账号是否重复
     * @number 99
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public Object addContract(@RequestBody JSONObject jsonParam, HttpSession httpSession){
        JsonResult jsonResult = new JsonResult();
        try{
            Integer contractId = jsonParam.getInteger("contractId");
            Integer goodsId = jsonParam.getInteger("goodsId");
            String contractShop = jsonParam.getString("contractShop");
            Integer contractNumber = jsonParam.getInteger("contractNumber");
            Integer singlePrice = jsonParam.getInteger("singlePrice");
            Integer realNumber = jsonParam.getInteger("realNumber");
            Contract contract = new Contract();
            contract.setContractid(contractId);
            contract.setGoodsid(goodsId);
            contract.setContractshop(contractShop);
            contract.setContractnumber(contractNumber);
            contract.setSingleprice(singlePrice);
            contract.setRealnumber(realNumber);
            contractService.addContract(contract);
            jsonResult.setStatus(1);
            jsonResult.setMsg("新建合同成功");
            return jsonResult;
        }catch (Exception e){
            System.out.println(e);
            jsonResult.setStatus(0);
            jsonResult.setMsg("新建合同失败");
            return jsonResult;
        }

    }
}
