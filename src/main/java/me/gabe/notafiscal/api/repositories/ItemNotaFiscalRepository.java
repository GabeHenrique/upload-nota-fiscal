package me.gabe.notafiscal.api.repositories;

import me.gabe.notafiscal.domain.models.ItemNotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItemNotaFiscalRepository extends JpaRepository<ItemNotaFiscal, UUID> {
}