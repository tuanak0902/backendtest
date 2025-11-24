// File: com.cinehub.fnb.dto.response.FnbCalculationResponse.java (ĐÃ SỬA)
package com.cinehub.fnb.dto.response;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class FnbCalculationResponse {

    // Tổng giá trị F&B của toàn bộ đơn hàng (Tổng cộng của totalFnbItemPrice)
    private BigDecimal totalFnbPrice;

    // DANH SÁCH CHI TIẾT các mục F&B đã được tính giá
    private List<CalculatedFnbItemDto> calculatedFnbItems;
}