package com.medianos.medianos.service;

import com.medianos.medianos.dto.MedianoDTO;
import com.medianos.medianos.entity.Mediano;

import java.util.List;
import java.util.Optional;

public interface IMedianoService {
    public List<MedianoDTO> getMedianos();
    public Mediano addMediano(MedianoDTO m);
    public Optional<Mediano> removeMediano(String id);
    public Optional<Mediano> getMedianoById(String id);
    public Optional<Mediano> getByName(String nombre);
    //public List<Photo> getPhotosMediano(String id);
}
