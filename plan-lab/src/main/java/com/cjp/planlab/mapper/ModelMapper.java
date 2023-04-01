package com.cjp.planlab.mapper;

import org.springframework.data.domain.Page;

import java.text.ParseException;
import java.util.List;
import java.util.Set;


public interface ModelMapper<T, Z> {

	public Z transformToDto(T entity);

	public T transformToPojo(Z dto) throws ParseException;

	public List<Z> transformToDto(List<T> entities);

	public List<T> transformToPojo(List<Z> dto) throws ParseException;

	public Set<Z> transformSetToDto(Set<T> entities);

	public Set<T> transformSetToPojo(Set<Z> dto);

	public Page<Z> transformToDto(Page<T> entities);

	public Page<T> transformToPojo(Page<Z> dto);

}
