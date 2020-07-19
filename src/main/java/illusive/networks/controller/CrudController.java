package illusive.networks.controller;

import illusive.networks.dto.BaseDTO;
import illusive.networks.service.CrudFacade;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.UUID;

/**
 * Created by alon on 1/2/2020.
 */
public class CrudController<DTO extends BaseDTO> {

    protected final CrudFacade<DTO> facade;

    public CrudController(CrudFacade<DTO> facade) {
        this.facade = facade;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<DTO> list() {
        return facade.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public DTO get(@PathVariable(value = "id") UUID id) {
        return facade.find(id).orElse(null);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(DTO dto) {
        facade.create(dto);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void update(UUID id, DTO dto) {
        facade.edit(dto);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") UUID id) {
        facade.delete(id);
    }

}
