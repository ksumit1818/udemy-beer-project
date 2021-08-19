package com.example.brewery.web.model;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@Builder
public class CustomerDto {
	private UUID id;
	private String custName;

	public CustomerDto(UUID id, String custName) {
		this.id = id;
		this.custName = custName;
	}

	public CustomerDto() {
	}

	public static CustomerDtoBuilder builder() {
		return new CustomerDtoBuilder();
	}

	public static class CustomerDtoBuilder {
		private UUID id;
		private String customerName;

		CustomerDtoBuilder() {
		}

		public CustomerDtoBuilder id(UUID id) {
			this.id = id;
			return this;
		}

		public CustomerDtoBuilder CustomerName(String customerName) {
			this.customerName = customerName;
			return this;
		}


		public CustomerDto build() {
			return new CustomerDto(id, customerName);
		}

		@Override
		public String toString() {
			return "CustomerDto.CustomerDtoBuilder [id=" + this.id + ", customerName=" + this.customerName + "]";
		}

	}
}
