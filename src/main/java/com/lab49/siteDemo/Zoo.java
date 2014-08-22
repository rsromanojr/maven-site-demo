package com.lab49.siteDemo;

import java.util.ArrayList;
import java.util.List;

import com.lab49.siteDemo.model.Animal;

/**
 * Where we keep {@link Animal}s when in captivity.
 * 
 * @author ross.romano
 */
public class Zoo {

	private List<Animal> animals;

	/**
	 * Default Constructor.
	 */
	public Zoo() {
		animals = new ArrayList<Animal>();
	}

	/**
	 * Adds an {@link Animal} to the {@link Zoo}.
	 * 
	 * @param animal
	 *            {@link Animal} to add.
	 */
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	/**
	 * Retrieves all the {@link Animal}s in the {@link Zoo}.
	 * <p/>
	 * <img src="doc-files/zoo_getAnimals.png" type="image/png" width="100"
	 * height="200">
	 * 
	 * @return The {@link Animal}s.
	 */
	public List<Animal> getAnimals() {
		return this.animals;
	}

}
