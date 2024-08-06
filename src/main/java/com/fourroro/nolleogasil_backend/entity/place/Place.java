/**
 * 장소 Entity 객체 필드 및 연관관계를 나타내고, 관리하는 클래스입니다.
 * 위시리스트(내 장소)에 저장되거나, 맛집메이트가 개설되는 장소를 저장하기 위해 존재합니다.
 * @author 박초은
 * @since 2024-01-05
 */
package com.fourroro.nolleogasil_backend.entity.place;

import com.fourroro.nolleogasil_backend.dto.place.PlaceDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Place")
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Place {

    @Id
    private Integer placeId;            //장소 id
    private String placeName;           //장소 이름
    private String placeAddress;        //주소
    private String placeRoadAddress;    //도로명 주소
    private String placePhone;          //전화번호
    private String placeUrl;            //장소 url
    private double placeLat;            //위도
    private double placeLng;            //경도
    private int placeCat;               //장소 카테고리(맛집(1), 카페(2), 숙소(3), 관광지(4) 中 1)

    //dto -> entity
    public static Place changeToEntity(PlaceDto dto) {
        return Place.builder()
                .placeId(dto.getPlaceId())
                .placeName(dto.getPlaceName())
                .placeAddress(dto.getPlaceAddress())
                .placeRoadAddress(dto.getPlaceRoadAddress())
                .placePhone(dto.getPlacePhone())
                .placeUrl(dto.getPlaceUrl())
                .placeLat(dto.getPlaceLat())
                .placeLng(dto.getPlaceLng())
                .placeCat(dto.getPlaceCat())
                .build();
    }

}
