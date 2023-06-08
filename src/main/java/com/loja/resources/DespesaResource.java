package com.loja.resources;

import com.loja.domain.Despesa;
import com.loja.service.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/despesa")
public class DespesaResource {

    @Autowired
    private DespesaService despesaService;

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public ResponseEntity<Despesa> findById(@PathVariable Integer id) {

        Despesa despesa = despesaService.findDespesaById(id);
        return ResponseEntity.ok().body(despesa);

    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Despesa> insert(@RequestBody Despesa despesa) {

        despesaService.insert(despesa);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody Despesa despesa, @PathVariable Integer id) {
        despesa.setId(id);
        despesaService.update(despesa);
        return ResponseEntity.noContent().build();

    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        despesaService.delete(id);
        return ResponseEntity.noContent().build();

    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Despesa>> findAll() {

        List<Despesa> despesas = despesaService.findAll();
        return ResponseEntity.ok().body(despesas);
    }


}
