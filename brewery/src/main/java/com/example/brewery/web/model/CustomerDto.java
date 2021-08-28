package com.example.brewery.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CustomerDto {
	private UUID id;
	private String custName;

//	public CustomerDto(UUID id, String custName) {
//		this.id = id;
//		this.custName = custName;
//	}
//
//	public CustomerDto() {
//	}
//
//	public static CustomerDtoBuilder builder() {
//		return new CustomerDtoBuilder();
//	}
//
//	public static class CustomerDtoBuilder {
//		private UUID id;
//		private String custName;
//
//		CustomerDtoBuilder() {
//		}
//
//		public CustomerDtoBuilder id(UUID id) {
//			this.id = id;
//			return this;
//		}
//
//		public CustomerDtoBuilder CustName(String custName) {
//			this.custName = custName;
//			return this;
//		}
//
//
//		public CustomerDto build() {
//			return new CustomerDto(id, custName);
//		}
//
//		@Override
//		public String toString() {
//			return "CustomerDto.CustomerDtoBuilder [id=" + this.id + ", custName=" + this.custName + "]";
//		}
//
//	}
}
