package com.manage.service.impl;


import com.manage.dao.ContractMapper;
import com.manage.entity.Contract;
import com.manage.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "contractService")
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractMapper contractMapper;

    @Override
    public int addContract(Contract contract){
        return contractMapper.insertSelective(contract);
    }
}
