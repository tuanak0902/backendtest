package com.cinehub.showtime.dto.request;

import lombok.Data;
import java.util.UUID;

@Data
public class SeatSelectionDetail {
    private UUID seatId;
    private String seatType;
    private String ticketType;
}