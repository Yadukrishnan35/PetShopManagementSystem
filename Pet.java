package com.blz.workshop;


public abstract class Pet {
		
	enum Colour{BLACK, RED, WHITE, BLUE, BLACK_WHITE, GREEN, GREY} 
		
		String id;
		String name;
		Colour colour;
		int age;
		int price;
		
		public abstract void eat();
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pet other = (Pet) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}		

}
