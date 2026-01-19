package com.bootcamp.demo_restful_api.controller;

import java.math.BigDecimal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
@ResponseBody
@ToString

public class CalculatorController {


  @GetMapping(value = "/sum/{x}/{y}")
  public Integer sum(@PathVariable Integer x, @PathVariable Integer y) {

    return x + y;
  }

  @GetMapping(value = "/subtract/{x}/{y}")
  public BigDecimal getSubtract(@PathVariable double x,
      @PathVariable double y) {
    return BigDecimal.valueOf(x).subtract(BigDecimal.valueOf(y));
  }

  @GetMapping(value = "/remainder/{x}/{y}")
  public String getRemainder(@PathVariable double x, @PathVariable double y) {
    // 使用 BigDecimal.valueOf(double) 進行精確運算
    BigDecimal[] results =
        BigDecimal.valueOf(x).divideAndRemainder(BigDecimal.valueOf(y));
    BigDecimal quotient = results[0];
    BigDecimal remainder = results[1];

    // 組合並回傳一個格式化字串
    // 例如：當 x=10.5, y=3 時，回傳 "商數為 3，餘數為 1.5"
    return String.format("當 %s 除以 %s 時，商數為 %s，餘數為 %s", x, y,
        quotient.toPlainString(), remainder.toPlainString());
  }


  @GetMapping(value = "/multiply/{x}/{y}")
    public String getMultiplication(@PathVariable String x, @PathVariable String y) {
        
        // 使用 String 建構子以確保最高精度
        BigDecimal num1 = new BigDecimal(x);
        BigDecimal num2 = new BigDecimal(y);
        
        // 執行乘法運算
        BigDecimal result = num1.multiply(num2);
        
        // 使用 toPlainString() 避免科學記號（如 1E+2），回傳格式化的句子
        return String.format("%s 乘以 %s 的結果為 %s", 
                             num1.toPlainString(), 
                             num2.toPlainString(), 
                             result.toPlainString());
    } 
  



}
